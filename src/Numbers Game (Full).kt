
import kotlin.random.Random
fun main(){
    val answer = Random.nextInt(10) // random
    var count = 0 // count
    println("Welcome to the number guessing game,write  quit at any time")

    while(count<3){ // count while
        print("Guess a number between 0 and 10: ")
        val guess = readLine()
        if(guess == "quit"){
            println("Exiting game...")
            break
        }
        try {
            if(guess!!.toInt() == answer){
                println("You got it!")
                break
            }else{
                if(count==2){
                    println("You lose. The number was $answer.")
                    break
                }else{
                    println("Try again")
                }
            }
            count++
            println("You have guessed $count time(s).") // number of guesses

        }catch (e: Exception){
            println("Please enter numbers only.")
        }
    }
    println("Game Finished") //write  end at any time
}