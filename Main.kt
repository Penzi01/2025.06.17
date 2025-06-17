//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 val a_nevem: String = "Márk"
 println ("Az én nevem  ${a_nevem}" )
 var szam: Float = 5f
 var szam_2: Float = 2f
 println("${szam.toInt()} + ${szam_2.toInt()} = ${(szam.toInt() + szam_2).toInt() }")
 println("${szam.toInt()} - ${szam_2.toInt()} = ${(szam.toInt() - szam_2).toInt() }")
 println("${szam.toInt()} / ${szam_2.toInt()} = ${(szam.toInt() / szam_2).toInt() }")
 println("${szam.toInt()} * ${szam_2.toInt()} = ${(szam.toInt() * szam_2).toInt() }")

print("kerlek irj be valamit:")
var bekert_szoveg = readln()
 if(bekert_szoveg.isEmpty()){
  println("HIBA: nem adtal meg semmyilyen szoveget")
 } else {
  println(bekert_szoveg)

 }


}
