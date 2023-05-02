package application;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomePage extends Application {

    @Override
    public void start(Stage primaryStage) {
    	BorderPane root = getRoot();

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Home!!!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static BorderPane getRoot() {
        BorderPane root = new BorderPane();

        // Create navbar at the top
        HBox navbar = new HBox();
        navbar.setPadding(new Insets(20, 40, 20, 20));
        navbar.setSpacing(10);
        navbar.setStyle("-fx-background-color: #363842;");

        // Add company logo to the left of the navbar
        Image image = new Image(HomePage.class.getResourceAsStream("BH.png"));
        ImageView companyName = new ImageView(image);
        companyName.setFitHeight(50);
        companyName.setPreserveRatio(true);
        navbar.getChildren().add(companyName);
        
        //Home
        companyName.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showHomePage();
			}
		});

        // Create region node to push navbar items to the right
        Region region = new Region();
        HBox.setHgrow(region, Priority.ALWAYS);

        // Create navbar items on the right of the navbar
        HBox navbarItems = new HBox();
        navbarItems.setSpacing(20);
        navbarItems.setAlignment(Pos.CENTER_RIGHT);
        
        //Navbar Label Event Handlers
        
        //News
        Label news = new Label("News");
        news.setStyle("-fx-text-fill: white;");
        news.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showNewsPage();
			}
        	
		});
        
        //Reports
        Label reports = new Label("Reports");
        reports.setStyle("-fx-text-fill: white;");
        reports.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showReportsPage();
			}
        	
		});
        
        //Letters
        Label letters = new Label("Letters");
        letters.setStyle("-fx-text-fill: white;");
        letters.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showLettersPage();
			}
        	
		});
        
        //Subsidiaries
        Label subsidiaries = new Label("Subsidiaries");
        subsidiaries.setStyle("-fx-text-fill: white;");
        subsidiaries.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showSubsidiariesPage();
			}
        	
		});
        
        //About
        Label about = new Label("About");
        about.setStyle("-fx-text-fill: white;");
        about.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showAboutPage();
			}
        	
		});
        
        //Investors
        Label investors = new Label("Investors");
        investors.setStyle("-fx-text-fill: white;");
        investors.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				MainPage.showInvestorsPage();
			}
        	
		});
        
        navbarItems.getChildren().addAll(news, reports, letters, subsidiaries, about, investors);

        // Add region node and navbar items to navbar
        navbar.getChildren().addAll(region, navbarItems);

        root.setTop(navbar);

        

        // Create hero section with banner image and text
        VBox heroSection = new VBox();
        heroSection.setPadding(new Insets(50));
        heroSection.setSpacing(10);
        navbar.setStyle("-fx-background-color: #363842;");
        heroSection.setStyle("-fx-background-image: url('file:/ui_2450_project/assets/banner.jpg'); -fx-background-size: cover;");

        // Create HBox to hold content on the left half of the section
        HBox leftContent = new HBox();
        leftContent.setSpacing(10);
        leftContent.setAlignment(Pos.CENTER_LEFT);

        // Create VBox to hold quote and button
        VBox quoteBox = new VBox();
        quoteBox.setSpacing(10);
        quoteBox.setAlignment(Pos.CENTER_LEFT);

        // Add quote label
        Label quoteLabel = new Label("Here's a great quote!");
        quoteLabel.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
        quoteBox.getChildren().add(quoteLabel);

        // Add button
        Button button = new Button("Learn More");
        button.setStyle("-fx-background-color: white; -fx-text-fill: #333333; -fx-font-size: 16; -fx-padding: 10 20;");
        quoteBox.getChildren().add(button);

        // Add quote and button VBox to leftContent
        leftContent.getChildren().add(quoteBox);

        // Add leftContent to heroSection
        heroSection.getChildren().add(leftContent);

        // Create ImageView to hold banner image
        ImageView bannerImage = new ImageView(new Image("file:/ui_2450_project/assets/banner.jpg"));
        bannerImage.setFitWidth(400);
        bannerImage.setFitHeight(400);
        bannerImage.setPreserveRatio(true);
        bannerImage.setSmooth(true);
        bannerImage.setCache(true);

        // Add banner image to right half of heroSection
        heroSection.getChildren().add(bannerImage);

        root.setCenter(heroSection);


        // Create content section with 4 main cards
        GridPane contentSection = new GridPane();
        contentSection.setPadding(new Insets(50));
        contentSection.setHgap(50);
        contentSection.setVgap(50);
        contentSection.setAlignment(Pos.CENTER);
        Label card1 = new Label("Home 1");
        card1.setStyle("-fx-font-size: 20;");
        Label card2 = new Label("Home 2");
        card2.setStyle("-fx-font-size: 20;");
        Label card3 = new Label("Home 3");
        card3.setStyle("-fx-font-size: 20;");
        Label card4 = new Label("Home 4");
        card4.setStyle("-fx-font-size: 20;");
        contentSection.add(card1, 0, 0);
        contentSection.add(card2, 1, 0);
        contentSection.add(card3, 0, 1);
        contentSection.add(card4, 1, 1);
        root.setCenter(contentSection);

        // Create about section for the website
        VBox aboutSection = new VBox();
        aboutSection.setPadding(new Insets(50));
        aboutSection.setSpacing(10);
        Label aboutText = new Label("About Us");
        aboutText.setStyle("-fx-font-size: 30;");
        Label aboutContent = new Label("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        aboutContent.setStyle("-fx-font-size: 16;");
        aboutSection.getChildren().addAll(aboutText, aboutContent);
        root.setBottom(aboutSection);

        // Create footer section
        HBox footer = new HBox();
        footer.setPadding(new Insets(10));
        footer.setSpacing(10);
        footer.setStyle("-fx-background-color: #333333;");
        Label copyright = new Label("Copyright © 2023");
        copyright.setStyle("-fx-text-fill: white;");
        Label privacyPolicy = new Label("Privacy Policy");
        privacyPolicy.setStyle("-fx-text-fill: white;");
        Label termsOfService = new Label("Terms of Service");
        termsOfService.setStyle("-fx-text-fill: white;");
        
        Label connectWithUs = new Label("Connect with us:");
        connectWithUs.setStyle("-fx-text-fill: white;");
        
        Label twitter = new Label("Twitter");
        twitter.setStyle("-fx-text-fill: white;");
        
        Label facebook = new Label("Facebook");
        facebook.setStyle("-fx-text-fill: white;");
        
        Label instagram = new Label("Instagram");
        instagram.setStyle("-fx-text-fill: white;");
        
        Label contactUs = new Label("Contact us:");
        contactUs.setStyle("-fx-text-fill: white;");
        
        footer.getChildren().addAll(
                new VBox(connectWithUs,
                        new HBox(twitter, facebook, instagram )
                ),
                new VBox(contactUs,
                        new Label("Email: contact@website.com"),
                        new Label("Phone: +1 123-456-7890")
                ),
                new VBox(new Label("Legal:"),
                        privacyPolicy,
                        termsOfService,
                        copyright
                )
        );
        root.setBottom(footer);
		return root;
	}

	public static void main(String[] args) {
        launch(args);
    }
}