/*
 * Copyright 2015 Armand Agopian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package assignments.semester1.FinalS1;

import java.util.Scanner;

/**
 * Created by Armdev on 12/11/15.
 */
public class BlackjackStarter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Blackjack BJGame = new Blackjack();

        while (true) {
            BJGame.playGame();
            System.out.println("Do you want to play again? (Y/N)");
            String choice = scan.next().toLowerCase();
            if (choice.startsWith("n")) {
                break;
            }
        }

        //get vars from other class
    }
}
