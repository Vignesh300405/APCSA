import java.util.*;

public class MovieRatings {
    public static void main(String[] args) {

	int[][] ratings = {{4, 6, 2, 5}, {7, 9, 4, 8}, {6, 9, 3, 7}};

	System.out.println(averageRatingByReviewer(ratings, 1));
	System.out.println(averageRatingByReviewer(ratings, 0));
	System.out.println(averageRatingByReviewer(ratings, 2));
	System.out.println();
	System.out.println(aboveX(ratings, 4));
	System.out.println(aboveX(ratings, 7));
	System.out.println(aboveX(ratings, 1));
	System.out.println();
	System.out.println(averageRating(ratings, 1));
	System.out.println(averageRating(ratings, 0));
	System.out.println(averageRating(ratings, 2));

    }

    static double averageRatingByReviewer(int[][] ratings, int reviewerIndex) {

	double total = 0;

	for(int rating : ratings[reviewerIndex]) {
	    total += rating;
	}

	double averageRating = total / (double) ratings[reviewerIndex].length;

	return averageRating;

    }

    static int aboveX(int[][] ratings, int x) {

	int output = 0;

	for(int i = 0; i < ratings.length; i++) {
	    for(int j = 0; j < ratings[i].length; j++) {
		if(ratings[i][j] > x) {
		    output++;
		}
	    }
	}

	return output;
	
    }

    static double averageRating(int[][] ratings, int movieIndex) {

	double total = 0;

	for(int i = 0; i < ratings.length; i++) {
	    total += ratings[i][movieIndex];
	}

	double average = total / (double) ratings.length;

	return average;
	
    }
}
