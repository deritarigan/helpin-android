package id.deritarigan.helpin_android

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("id.deritarigan.helpin_android", appContext.packageName)
    }
}
