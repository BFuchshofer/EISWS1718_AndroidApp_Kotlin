package check

import android.bluetooth.BluetoothAdapter
import android.content.Context
import android.content.Intent
import android.support.v4.app.ActivityCompat.startActivityForResult
import android.app.Activity



/**
 * Created by Basti on 14.03.2018.
 */


// Checks if Bluetooth adapter is enabled. If not it gets enabled
fun checkBluetoothAdapter(context: Context) {

    var mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
    val REQUEST_ENABLE_BT = 1

    if (!mBluetoothAdapter.isEnabled()) {
        val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
        (context as Activity).startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT)
    }
}


fun main (args: Array<String>) {

}