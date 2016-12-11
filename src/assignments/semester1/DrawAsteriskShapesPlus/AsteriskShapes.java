/*
 * Copyright © 2017 Armand Agopian
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

package assignments.semester1.DrawAsteriskShapesPlus;

import java.util.Scanner;

public class AsteriskShapes {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        CoreParams coreShape = new CoreParams();

        ShapeChoice shapeChoice = coreShape.promptInputParams();

        if (shapeChoice == ShapeChoice.unknown) {
            System.out.println("Sorry not one of the options");
        } else {
            coreShape.drawShape(shapeChoice);
        }


    }


}