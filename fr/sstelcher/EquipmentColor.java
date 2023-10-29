package fr.sstelcher;

//la classe enum est toujours final
public enum EquipmentColor {
    RED("Rouge", "FF0000"),
    BLUE("Blue", "00FF00"),
    Green("Green", "0000FF");

    //dans une classe enum, les constructeurs et variables doivent etre private
    private EquipmentColor(String _color, String _hexValue){
        this.color = _color;
        this.hexValue = _hexValue;
    }

    public String toString(){
        return this.color;
    }

    private String color;
    private String hexValue;
}
