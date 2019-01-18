package com.example.kinhangpoon.moviedb.common

import android.app.Dialog
import android.app.ProgressDialog
import android.os.Bundle
import android.support.v4.app.DialogFragment

class ProgressDialogFragment : DialogFragment() {
    companion object {
        val DIALOG_TAG = "dialog tag"
        val EXTRA_MESSAGE = "message"
        val EXTRA_CANCELABLE = "cancelable"
        fun buildProgressDialogFragment(messageId: Int, cancelable: Boolean): ProgressDialogFragment {
            val fragment = ProgressDialogFragment()
            var args = Bundle()
            args.putInt(EXTRA_MESSAGE, messageId)
            args.putBoolean(EXTRA_CANCELABLE, cancelable)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val initialMessage = arguments?.getInt(EXTRA_MESSAGE)?.let { resources.getString(it) }
        val cancelable = arguments?.getBoolean(EXTRA_CANCELABLE)
        var dialog = ProgressDialog(activity)
        dialog.setMessage(initialMessage)
        if (cancelable != null) {
            dialog.setCancelable(cancelable)
            if (!cancelable) {
                dialog.setCanceledOnTouchOutside(false)
            }
        }
        return dialog

    }

}