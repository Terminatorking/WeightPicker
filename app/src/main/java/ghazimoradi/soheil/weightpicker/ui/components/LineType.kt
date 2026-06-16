package ghazimoradi.soheil.weightpicker.ui.components

sealed class LineType {
    object Normal : LineType()
    object FiveStep : LineType()
    object TenStep : LineType()
}