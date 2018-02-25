package id.co.imastudio.scanbarcodekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.zxing.Result
import me.dm7.barcodescanner.zxing.ZXingScannerView
import id.co.imastudio.scanbarcodekotlin.R.id.tvresult
import id.co.imastudio.scanbarcodekotlin.R.id.tvresult







class ScanActivity : AppCompatActivity(), ZXingScannerView.ResultHandler {


    private var mScannerView: ZXingScannerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)

        mScannerView =ZXingScannerView(this);
        setContentView(mScannerView);
    }

    public override fun onResume() {
        super.onResume()
        mScannerView?.setResultHandler(this) // Register ourselves as a handler for scan results.
        mScannerView?.startCamera()          // Start camera on resume
    }

    public override fun onPause() {
        super.onPause()
        mScannerView?.stopCamera()           // Stop camera on pause
    }

    override fun handleResult(p0: Result?) {


     MainActivity().textView?.setText(p0?.text.toString())
        onBackPressed()
    }


//
//    fun handleResult(rawResult: Result) {
//        // Do something with the result here
//        // Log.v("tag", rawResult.getText()); // Prints scan results
//        // Log.v("tag", rawResult.getBarcodeFormat().toString()); // Prints the scan format (qrcode, pdf417 etc.)
//
//        MainActivity.tvresult.setText(rawResult.getText())
//        onBackPressed()
//
//        // If you would like to resume scanning, call this method below:
//        //mScannerView.resumeCameraPreview(this);
//    }
}
