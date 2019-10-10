package id.deritarigan.helpin_android.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import id.deritarigan.helpin_android.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mapView.onCreate(savedInstanceState)
        mapView.onResume()
        initView()
    }

    fun initView() {
        syncCamera()
    }

    fun syncCamera() {
        mapView.getMapAsync(object : OnMapReadyCallback {
            override fun onMapReady(mMap: GoogleMap?) {
                mMap?.clear()
                val currentLocation = CameraPosition.Builder().target(LatLng(-7.413000, 111.439720))
                    .zoom(20.0f)
                    .bearing(0f)
                    .tilt(0f)
                    .build()
                mMap?.getUiSettings()?.isScrollGesturesEnabled = true
                mMap?.moveCamera(CameraUpdateFactory.newCameraPosition(currentLocation))
            }
        })
    }


}
