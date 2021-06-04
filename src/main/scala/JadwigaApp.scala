package com.mhalab

import scala.io.StdIn.readLine

object Jadwiga {
  def reply(msg: String): String = msg split "\\s+" match {
    case Array("cześć") => "cześć"
    case Array("hej") => "cze"
    case Array("hejka") => "no hejka!"
    case Array("siema") => "no siema"
    case Array("elo") => "no elo mordo!"
    case Array("tak") => "Aha"
    case Array("nie") => "OK"
    case Array("koniec") => "OK"
    case Array("nara") => "narka"
    case Array("dlaczego") => "trudno powiedzieć"
    case Array("dobrze") => ":)"
    case Array("źle") => ":("
    case Array(x) => s"Aha, $x"

    case Array("dzień", "dobry") => "dzień dobry"
    case Array("do", "widzenia") => "do zobaczenia"
    case Array("która", "godzina") => "nie mam zegarka"
    case Array("nie", "wiem") => "wymyśl coś"
    case Array("nie", "chcę") => "Postaraj się"
    case Array("o", "czym") => "O czym chcesz"
    case Array("jak", "leci") => "powolutku"
    case Array("jak", "tam") => "jakoś leci"
    case Array("co", "tam") => "nic nowego"
    case Array("jak", "to") => "no tak"
    case Array("co", "słychać") => "miałam dużo pracy"
    case Array("od", "czego") => "od wielu różnych rzeczy"
    case Array("na", "przykład") => "Nie chcę o tym teraz kmówić. Porozmawiajmy lepiej o Tobie!"
    case Array("a", "ty") => "Jesteśmy tu po to aby rozmawiać o Tobie."
    case Array("jestem", x) => s"$x?"
    case Array("co", _) => s"nic"
    case Array("ej", _) => "Nie złość się"
    case Array("no", _) => "Nie i już!"
    case Array("nie", _) => "Pomyśl jak to zmienić"
    case Array("skąd", _) => "Tajemnica ;)"
    case Array("znasz", x) => s"$x? Nie."
    case Array("jesteś", _) => "To dobrze czy źle?"
    case Array("lubisz", _) => "Tak :)"
    case Array("właśnie", _) => "To dobrze?"
    case Array("jak", _) => "sama nie wiem"
    case Array(x, "jadwigo") => s"Ty $x"
    case Array(x, "się") => s"Ty się $x"
    case Array(_, "też") => "Luz"
    case Array(_, "tam") => "tam czyli gdzie?"
    case Array(_, "dowcip") => "Ten o gąsce balbince?"
    case Array(_, "kawał") => "Jak pies kiełbasę spawał?"
    case Array(_, "źle") => "To smutne. Jak Ci pomóc?"
    case Array(_, "mnie") => "Dobrze"
    case Array(_, "coś") => "Ale co?"
    case Array(_, "tobie") => "Dlaczego?"
    case Array(_, z) => s"$z? Porozmawiajmy o tym"


    case Array("dwa", "razy", "dwa") => "cztery"
    case Array("jak", "się", "nazywasz") => "Jadwiga"
    case Array("czuję", "się", x) => s"Jak bardzo $x?"
    case Array("jak", "to", x) => s"no $x"
    case Array("nie", _, "mnie") => "Bo?"
    case Array("nie", _, "się") => "Dobrze, ale jak?"
    case Array("lubisz", x, _) => s"Nie lubię $x :("
    case Array("nie", _, _) => "Spróbuj"
    case Array("ale", _, _) => "to zależy od Ciebie"
    case Array("ile", _, _) => "Policzmy to razem!"
    case Array("jesteś", x, y) => s"Jakie to ma znaczenie, że jestem $x $y?"
    case Array(x, "się", _) => s"Ty się $x"
    case Array(x, "mi", _) => s"Ty mi $x"
    case Array(_, "jest", y) => s"Dlaczego $y?"
    case Array(_, "mogę", x) => s"Po co chcesz $x?"
    case Array(_, _, "imię") => "Jadwiga"
    case Array(_, _, "lat") => "A jak myślisz?"
    case Array(_, _, "źle") => "To bardzo smutne. Jak Ci pomóc?"
    case Array(_, _, "dobrze") => "To super!"
    case Array(_, _, "mną") => "Jak długo zechcesz"
    case Array(_, _, "też") => "spoko"
    case Array(_, _, "tobie") => "Nie czas teraz na to"
    case Array(_, _, x) => s"Zastanawia mnie to \"$x\"... Rozwiniesz?"

    case Array("wiesz", _, _, _) => "Wiem ale chcę o tym usłyszeć od Ciebie."
    case Array("bo", _, _, _) => "Rozumiem"
    case Array("nie", _, y, z) => s"$y $z?"
    case Array("co", _, _, "słychać") => "to zależy"
    case Array("jak", "ci", z, p) => s"A Tobie jak $z $p?"
    case Array(_, "matka", _, _) => "Opowiedz mi więcej o swojej rodzinie"
    case Array(_, "mi", _, _) => s"Wolę jak Ty to robisz"
    case Array(x, "jest", y, z) => s"Dlaczego uważasz, że $x jest $y $z?"
    case Array(_, "lubisz", x, _) => s"Nie. Nie lubię $x"
    case Array(_, y, "jest", z) => s"Dlaczego $y jest $z?"
    case Array(_, _, "to", z) => s"Dlaczego $z?"
    case Array(_, _, _, "imię") => "Jadwiga"
    case Array(_, _, _, x) => s"$x? Dlaczego tak uważasz?"

    case Array("czy", "ty", _, _, _) => "Wolę rozmawiać o Tobie"
    case Array(_, _, _, _, _) => s"Naprawdę???"

    case Array(_, _, _, _, x, _) => s"Jakie śmieszne słowo - \"$x\"! :D"

    case _ => "mów dalej"
  }
}

object JadwigaApp extends App {
  private val StopCondition = "do widzenia"

  private def handleMsg(msg: String, stopCondition: String): Boolean = {
    println(Jadwiga reply msg.toLowerCase.replaceAll("[!?.,\\-()]", ""))
    msg != stopCondition
  }

  while (handleMsg(readLine(">"), StopCondition)) {}
}
