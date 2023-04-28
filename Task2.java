// 2. Если необходимо, исправьте данный код 
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
        
        try {
            int d = 0;
            int[] intArray = { 12, 34, 52, 6, 67 };
            double catchRes1 = intArray[8] / d;
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        }
