package org.allatra.wisdom.library.ui.listener

import android.os.Handler
import android.view.MotionEvent
import com.github.barteksc.pdfviewer.listener.OnTapListener
import com.google.android.material.floatingactionbutton.FloatingActionButton


class PdfViewerOnTapListener(val buttonsArray: Array<FloatingActionButton>): OnTapListener {

    override fun onTap(e: MotionEvent?): Boolean {
        buttonsArray.forEach { button ->

            button.show()

//            if(button.isOrWillBeShown){
//                button.hide()
//            } else {
//                button.show()
//            }
        }
        Handler().postDelayed(({ this }), 3000)
        buttonsArray.forEach { button ->
            button.hide()
        }

        return true
    }
}