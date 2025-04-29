using System;

class Program
{
    static void Main()
    {
        //  Part 1: Dice Game 
        Random dice = new Random();
        int roll1 = dice.Next(1, 7);
        int roll2 = dice.Next(1, 7);
        int roll3 = dice.Next(1, 7);
        int total = roll1 + roll2 + roll3;

        Console.WriteLine("=== Dice Game ===");
        Console.WriteLine($"Dice roll: {roll1} + {roll2} + {roll3} = {total}");

        if ((roll1 == roll2) && (roll2 == roll3))
        {
            Console.WriteLine("You rolled triples! +6 bonus to total!");
            total += 6;
        }
        else if ((roll1 == roll2) || (roll2 == roll3) || (roll1 == roll3))
        {
            Console.WriteLine("You rolled doubles! +2 bonus to total!");
            total += 2;
        }

        Console.WriteLine($"Total score: {total}");

        if (total >= 15)
        {
            Console.WriteLine("You win!");
        }
        else
        {
            Console.WriteLine("Sorry, you lose.");
        }

        Console.WriteLine(); // Add space between sections

        //  Part 2: Subscription Status
        Random random = new Random();
        int daysUntilExpiration = random.Next(12); // 0–11
        int discountPercentage = 0;

        Console.WriteLine("=== Subscription Status ===");

        if (daysUntilExpiration < 1)
        {
            Console.WriteLine("Your subscription has expired!");
        }
        else if (daysUntilExpiration == 1)
        {
            discountPercentage = 20;
            Console.WriteLine("Your subscription expires within a day!");
            Console.WriteLine($"Renew now and save {discountPercentage}%!");
        }
        else if (daysUntilExpiration <= 5)
        {
            discountPercentage = 10;
            Console.WriteLine($"Your subscription expires in: {daysUntilExpiration} days.");
            Console.WriteLine($"Renew now and save {discountPercentage}%!");
        }
        else if (daysUntilExpiration <= 10)
        {
            Console.WriteLine($"Your subscription expires in: {daysUntilExpiration} days.");
            Console.WriteLine("Your subscription will expire soon. Renew now!");
        }
        else
        {
            Console.WriteLine($"Your subscription expires in: {daysUntilExpiration} days.");
        }
    }
}
