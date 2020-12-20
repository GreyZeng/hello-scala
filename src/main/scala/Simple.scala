package git.snippet.scala

import scala.collection.immutable

/**
 * Young
 * 2020/12/19
 * */
object Simple {
  def main(args: Array[String]): Unit = {
    var a = 2
    if (a > 3) {
      println(s"$a>3")
    } else {
      println(s"$a<3")
    }
    var b = 3
    while (b < 10) {
      b += 1;
    }
    println(b)
    println("---")


    // for (int i = 0; i < 10; i++)
    val inclusive = 1 to 10
    println(inclusive)
    val sequences: Range.Inclusive = 1 to(10, 2)
    println(sequences)


    val seqs = 1 until 10
    println(seqs)


    for (i <- seqs if (i % 2 == 0)) {
      println(i)
    }

    println("----------")
    for (i <- 1 to 9) {
      for (j <- 1 to 9) {
        if (j <= i) {
          print(s"$i * $j = ${i * j}\t")
        }
        if (j == i) {
          println()
        }
      }
    }

                              var num = 0
    for (i <- 1 to 9; j <- 1 to 9 if (j <= i)) {
      num+=1
      if (j <= i) {
        print(s"$i * $j = ${i * j}\t")
      }
      if (j == i) {
        println()
      }
    }
    println(num)



    val seqCharSequence: immutable.IndexedSeq[Int] = for (i<-1 to 10) yield {
      val x = 8
      i + x
    }
    println(seqCharSequence)
    for(i<-seqCharSequence) {
      println(i)
    }
  }
}
