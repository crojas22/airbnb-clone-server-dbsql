package com.example.airbnb.core;

import com.example.airbnb.experience.Experience;
import com.example.airbnb.experience.ExperienceService;
import com.example.airbnb.home.Home;
import com.example.airbnb.home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DatabaseLoader implements ApplicationRunner{

    private final HomeService homesService;
    private final ExperienceService experienceService;

    @Autowired
    public DatabaseLoader(HomeService homesService,
                          ExperienceService experienceService) {
        this.homesService = homesService;
        this.experienceService = experienceService;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        Home home = new Home(
                "Miami", "Florida", "United States", "Loft Studio in the Central Area",
                "Entire Apartment", "Apartment", "Free cancellation", "per night" ,45, 2, 1, 1
        );
        String[] photos = {"/images/homes/home1.jpeg", "/images/homes/home1-2.jpeg"};
        home.setPhotos(Arrays.asList(photos));
        this.homesService.createHomeListing(home);

        Home home1 = new Home(
                "New York", "New York", "United States", "In the historical center of New York",
                "Entire House","House","Free cancellation","per night",60, 3, 3, 2
        );
        String[] photos1 = {"/images/homes/home2-2.jpeg", "/images/homes/home2-1.jpeg"};
        home1.setPhotos(Arrays.asList(photos1));
        this.homesService.createHomeListing(home1);

        Home home2 = new Home(
                "Texas", "Houston", "United States", "Lorem ipsum dolor sit amet",
                "Entire Condo","Condo", "Free cancellation","per night",95, 3, 3, 2
        );
        String[] photos2 = {"/images/homes/home3-2.jpeg", "/images/homes/home3-1.jpeg"};
        home2.setPhotos(Arrays.asList(photos2));
        this.homesService.createHomeListing(home2);

        Home home3 = new Home(
                "Seattle", "Washington", "United States", "Lorem ipsum dolor sit amet",
                "Entire House", "House", "Free cancellation","per night",45, 1, 1, 1
        );
        String[] photos3 = {"/images/homes/home4-2.jpeg", "/images/homes/home4-1.jpeg"};
        home3.setPhotos(Arrays.asList(photos3));
        this.homesService.createHomeListing(home3);

        Home home6 = new Home(
                "Texas", "Houston", "United States", "Lorem ipsum dolor sit amet",
                "Private Room","Apartment", "Free cancellation","per night",35, 1, 1, 1
        );
        String[] photos6 = {"/images/homes/home3-1.jpeg", "/images/homes/home3-2.jpeg"};
        home6.setPhotos(Arrays.asList(photos6));
        this.homesService.createHomeListing(home6);

        Home home7 = new Home(
                "Seattle", "Washington", "United States", "Lorem ipsum dolor sit amet dolor",
                "Private Room", "House","Free cancellation","per night",40, 1, 1, 1
        );
        String[] photos7 = {"/images/homes/home4-1.jpeg", "/images/homes/home4-2.jpeg"};
        home7.setPhotos(Arrays.asList(photos7));
        this.homesService.createHomeListing(home7);

        Home home4 = new Home(
                "Miami", "Florida", "United States", "Loft Studio in the Central Area",
                "Entire Apartment","Apartment","Free cancellation","per night",45, 2, 1, 1
        );
        String[] photos4 = {"/images/homes/home1-2.jpeg", "/images/homes/home1.jpeg"};
        home4.setPhotos(Arrays.asList(photos4));
        this.homesService.createHomeListing(home4);

        Home home5 = new Home(
                "New York", "New York", "United States", "In the historical center of New York",
                "Entire Home","House","Free cancellation","per night",60, 3, 3, 2
        );
        String[] photos5 = {"/images/homes/home2-1.jpeg", "/images/homes/home2-2.jpeg"};
        home5.setPhotos(Arrays.asList(photos5));
        this.homesService.createHomeListing(home5);

        Experience experience = new Experience(
                "Miami", "Florida", "United States", "Beach & Sport Bike & Hangout",
                "Sports experience", "Miami Beach", "3", "English and Spanish",
                "per person", 40
        );
        String[] photoEx1 = {"/images/activity/activity0-2.jpeg", "/images/activity/activity0-height.jpeg"};
        experience.setPhotos(Arrays.asList(photoEx1));
        this.experienceService.createExperience(experience);

        Experience experience2 = new Experience(
                "Atlanta", "Georgia", "United States", "Lorem ipsum dolor sit amet dolor",
                "Sports experience", "Atlanta", "2", "English and Spanish",
                "per person", 20
        );
        String[] photoEx2 = {"/images/activity/activity0-2.jpeg", "/images/activity/activity0-height.jpeg"};
        experience2.setPhotos(Arrays.asList(photoEx2));
        this.experienceService.createExperience(experience2);

        Experience experience3 = new Experience(
                "Houston", "Texas", "United States", "Lorem ipsum dolor sit amet dolor",
                "Nature experience", "Houston", "4", "English",
                "per person", 60
        );
        String[] photoEx3 = {"/images/activity/activity1-2.jpeg", "/images/activity/activity1-height.jpeg"};
        experience3.setPhotos(Arrays.asList(photoEx3));
        this.experienceService.createExperience(experience3);

        Experience experience4 = new Experience(
                "Philadelphia", "Pennsylvania", "United States", "Lorem ipsum dolor sit amet dolor",
                "Nature experience", "Philadelphia", "5", "English and French",
                "per person", 100
        );
        String[] photoEx4 = {"/images/activity/activity1-2.jpeg", "/images/activity/activity1-height.jpeg"};
        experience4.setPhotos(Arrays.asList(photoEx4));
        this.experienceService.createExperience(experience4);

        Experience experience5 = new Experience(
                "Los Angeles", "California", "United States", "Lorem ipsum dolor sit amet dolor",
                "Relaxation experience", "Hollywood", "1", "English and Spanish",
                "per person", 150
        );
        String[] photoEx5 = {"/images/activity/activity3-2.jpeg", "/images/activity/activity3-height.jpeg"};
        experience5.setPhotos(Arrays.asList(photoEx5));
        this.experienceService.createExperience(experience5);

        Experience experience6 = new Experience(
                "New York", "New York", "United States", "Lorem ipsum dolor sit amet dolor",
                "Relaxation and exercise", "Manhattan", "1", "English and Spanish",
                "per person", 150
        );
        String[] photoEx6 = {"/images/activity/activity3-2.jpeg", "/images/activity/activity3-height.jpeg"};
        experience6.setPhotos(Arrays.asList(photoEx6));
        this.experienceService.createExperience(experience6);

        Experience experience7 = new Experience(
                "Chicago", "Illinois", "United States", "Lorem ipsum dolor sit amet dolor",
                "Sport experience", "Chicago", "2", "English and Spanish",
                "per person", 30
        );
        String[] photoEx7 = {"/images/activity/activity4-2.jpeg", "/images/activity/activity4-height.jpeg"};
        experience7.setPhotos(Arrays.asList(photoEx7));
        this.experienceService.createExperience(experience7);

        Experience experience8 = new Experience(
                "Miami", "Florida", "United States", "Lorem ipsum dolor sit amet dolor",
                "Sport experience", "Kendall", "1", "English and Spanish",
                "per person", 45
        );
        String[] photoEx8 = {"/images/activity/activity4-2.jpeg", "/images/activity/activity4-height.jpeg"};
        experience8.setPhotos(Arrays.asList(photoEx8));
        this.experienceService.createExperience(experience8);

        ////////////////////


        Home home9 = new Home(
                "Orlando", "Florida", "United States", "Loft Studio in the Central Area",
                "Entire Apartment", "Apartment", "Free cancellation", "per night" ,100, 3, 3, 2
        );
        String[] photos9 = {"/images/homes/home1.jpeg", "/images/homes/home1-2.jpeg"};
        home9.setPhotos(Arrays.asList(photos9));
        this.homesService.createHomeListing(home9);

        Home home10 = new Home(
                "Trenton", "New Jersey", "United States", "In the historical center of New York",
                "Entire House","House","Free cancellation","per night",200, 1, 1, 1
        );
        String[] photos10 = {"/images/homes/home2-2.jpeg", "/images/homes/home2-1.jpeg"};
        home10.setPhotos(Arrays.asList(photos10));
        this.homesService.createHomeListing(home10);

        Home home11 = new Home(
                "Texas", "San Antonio", "United States", "Lorem ipsum dolor sit amet",
                "Entire Condo","Condo", "Free cancellation","per night",50, 2, 6, 1
        );
        String[] photos11 = {"/images/homes/home3-2.jpeg", "/images/homes/home3-1.jpeg"};
        home11.setPhotos(Arrays.asList(photos11));
        this.homesService.createHomeListing(home11);

        Home home12 = new Home(
                "Portland", "Oregon", "United States", "Lorem ipsum dolor sit amet",
                "Entire House", "House", "Free cancellation","per night",55, 4, 2, 2
        );
        String[] photos12 = {"/images/homes/home4-2.jpeg", "/images/homes/home4-1.jpeg"};
        home12.setPhotos(Arrays.asList(photos12));
        this.homesService.createHomeListing(home12);

        Home home13 = new Home(
                "Albuquerque", "New Mexico", "United States", "Lorem ipsum dolor sit amet",
                "Private Room","Apartment", "Free cancellation","per night",35, 1, 1, 1
        );
        String[] photos13 = {"/images/homes/home3-1.jpeg", "/images/homes/home3-2.jpeg"};
        home13.setPhotos(Arrays.asList(photos13));
        this.homesService.createHomeListing(home13);

        Home home14 = new Home(
                "San Francisco", "California", "United States", "Lorem ipsum dolor sit amet dolor",
                "Private Room", "House","Free cancellation","per night",200, 1, 1, 1
        );
        String[] photos14 = {"/images/homes/home4-1.jpeg", "/images/homes/home4-2.jpeg"};
        home14.setPhotos(Arrays.asList(photos14));
        this.homesService.createHomeListing(home14);

        Home home15 = new Home(
                "West Palm Beach", "Florida", "United States", "Loft Studio in the Central Area",
                "Entire Apartment","Apartment","Free cancellation","per night",150, 2, 1, 1
        );
        String[] photos15 = {"/images/homes/home1-2.jpeg", "/images/homes/home1.jpeg"};
        home15.setPhotos(Arrays.asList(photos15));
        this.homesService.createHomeListing(home15);

        Home home16 = new Home(
                "Philadelphia", "Pennsylvania", "United States", "In the historical center of New York",
                "Entire Home","House","Free cancellation","per night",60, 3, 2, 2
        );
        String[] photos16 = {"/images/homes/home2-1.jpeg", "/images/homes/home2-2.jpeg"};
        home16.setPhotos(Arrays.asList(photos16));
        this.homesService.createHomeListing(home16);

        Experience experience9 = new Experience(
                "Orlando", "Florida", "United States", "Beach & Sport Bike & Hangout",
                "Sports experience", "Orlando", "3", "English and Spanish",
                "per person", 40
        );
        String[] photoEx9 = {"/images/activity/activity0-2.jpeg", "/images/activity/activity0-height.jpeg"};
        experience9.setPhotos(Arrays.asList(photoEx9));
        this.experienceService.createExperience(experience9);

        Experience experience10 = new Experience(
                "New Orleans", "Louisiana", "United States", "Lorem ipsum dolor sit amet dolor",
                "Sports experience", "New Orleans", "4", "English and French",
                "per person", 20
        );
        String[] photoEx10 = {"/images/activity/activity0-2.jpeg", "/images/activity/activity0-height.jpeg"};
        experience10.setPhotos(Arrays.asList(photoEx10));
        this.experienceService.createExperience(experience10);

        Experience experience11 = new Experience(
                "Tucson", "Arizona", "United States", "Lorem ipsum dolor sit amet dolor",
                "Nature experience", "Tucson", "4", "English",
                "per person", 80
        );
        String[] photoEx11 = {"/images/activity/activity1-2.jpeg", "/images/activity/activity1-height.jpeg"};
        experience11.setPhotos(Arrays.asList(photoEx11));
        this.experienceService.createExperience(experience11);

        Experience experience12 = new Experience(
                "Philadelphia", "Pennsylvania", "United States", "Lorem ipsum dolor sit amet dolor",
                "Nature experience", "Philadelphia", "5", "English and French",
                "per person", 100
        );
        String[] photoEx12 = {"/images/activity/activity1-2.jpeg", "/images/activity/activity1-height.jpeg"};
        experience12.setPhotos(Arrays.asList(photoEx12));
        this.experienceService.createExperience(experience12);

        Experience experience13 = new Experience(
                "San Diego", "California", "United States", "Lorem ipsum dolor sit amet dolor",
                "Relaxation experience", "San Diego", "1", "English and Spanish",
                "per person", 150
        );
        String[] photoEx13 = {"/images/activity/activity3-2.jpeg", "/images/activity/activity3-height.jpeg"};
        experience13.setPhotos(Arrays.asList(photoEx13));
        this.experienceService.createExperience(experience13);

        Experience experience14 = new Experience(
                "Boston", "Massachusetts", "United States", "Lorem ipsum dolor sit amet dolor",
                "Relaxation and exercise", "Boston", "1", "English and Spanish",
                "per person", 150
        );
        String[] photoEx14 = {"/images/activity/activity3-2.jpeg", "/images/activity/activity3-height.jpeg"};
        experience14.setPhotos(Arrays.asList(photoEx14));
        this.experienceService.createExperience(experience14);

        Experience experience15 = new Experience(
                "Detroit", "Michigan", "United States", "Lorem ipsum dolor sit amet dolor",
                "Sport experience", "Detroit", "2", "English and Spanish",
                "per person", 30
        );
        String[] photoEx15 = {"/images/activity/activity4-2.jpeg", "/images/activity/activity4-height.jpeg"};
        experience15.setPhotos(Arrays.asList(photoEx15));
        this.experienceService.createExperience(experience15);

        Experience experience16 = new Experience(
                "Miami", "Florida", "United States", "Lorem ipsum dolor sit amet dolor",
                "Sport experience", "Hialeah", "1", "English and Spanish",
                "per person", 45
        );
        String[] photoEx16 = {"/images/activity/activity4-2.jpeg", "/images/activity/activity4-height.jpeg"};
        experience16.setPhotos(Arrays.asList(photoEx16));
        this.experienceService.createExperience(experience16);
    }
}
