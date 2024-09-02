import java.util.Scanner;

class Q18 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] ratings = new int[150];

        int[] ratingCounts = new int[5];

        int totalRatings = 0;
        int sumRatings = 0;

        for (int i = 0; i < 150; i++) {
            System.out.print("Enter the rating for Customer " + (i + 1) + " (1-5 stars) - ");
            int rating = sc.nextInt();

            if (rating < 1) {
                rating = 1;
            } else if (rating > 5) {
                rating = 5;
            }

            ratings[i] = rating;
            ratingCounts[rating - 1]++;

            totalRatings++;
            sumRatings += rating;
        }

        double averageRating = sumRatings / (double) totalRatings;

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " star ratings: " + ratingCounts[i]);
        }

        System.out.println("Average rating: " + averageRating);

        if (averageRating >= 4) {
            System.out.println("Highly Rated Product");
        } else {
            System.out.println("Product Needs Improvement");
        }
    }
}
