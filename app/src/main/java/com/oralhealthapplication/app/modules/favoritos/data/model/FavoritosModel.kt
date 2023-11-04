package com.oralhealthapplication.app.modules.favoritos.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FavoritosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAFTA: String? = MyApp.getInstance().resources.getString(R.string.lbl_afta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCANDIDASE: String? = MyApp.getInstance().resources.getString(R.string.lbl_candid_ase)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMUCOCELE: String? = MyApp.getInstance().resources.getString(R.string.lbl_mucocele)

)
