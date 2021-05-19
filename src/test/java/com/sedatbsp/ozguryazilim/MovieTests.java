package com.sedatbsp.ozguryazilim;

import com.sedatbsp.ozguryazilim.business.concretes.MovieManager;
import com.sedatbsp.ozguryazilim.model.Actor;
import com.sedatbsp.ozguryazilim.model.Movie;
import com.sedatbsp.ozguryazilim.repository.IMovieRepository;
import javassist.NotFoundException;
import org.aspectj.lang.annotation.Before;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ExtendWith(SpringExtension.class)
@SpringBootTest(properties = {"spring.profiles.active.dev"})
public class MovieTests {

    @Autowired
    private IMovieRepository movieRepository;


    @Test
    public void add() {
        String actors="Russell Crowe, Joaquin Phoenix, Lucilla Richard Harris, David Hemmings, Derek Jacobi, Djimon Hounsou";
        Movie movie = new Movie("Gladyatör Test", 2000, "Aksiyon / Macera", "" +

                "General Maximus’un imparatorluk içerisinde yükselmesi karşısında " +
                "kıskançlığa kapılan tahtın varisi Commodus, general ile ailesinin " +
                "derhâl öldürülmesi emrini çıkarır. Ölümden zor kurtulan Maximus’u artık " +
                "kölelik yaşamı beklemektedir. Arenaya gönderilerek orada bir gladyatör olarak eğitilir. " +
                "Yıllar sonra Roma’ya geri döndüğünde tek bir amacı vardır. " +
                "Yeni İmparator Commodus’u öldürerek karısıyla oğlunun katledilmesinin intikamını almak",

                "https://upload.wikimedia.org/wikipedia/tr/8/8d/Gladiator_ver1.jpg",
                "Türkçe",
                actors,
                toList(actors)
                );

        movieRepository.save(movie);

    }

    public List toList(String nameOfActors){
        String[] actorsArr = nameOfActors.trim().split(",");
        Actor[] actors = new Actor[actorsArr.length];
        for (int i=0; i<actors.length;i++){
            Actor actor = new Actor();
            actor.setName(actorsArr[i]);
            actors[i] = actor;
        }
        return Arrays.stream(actors).collect(Collectors.toList());
    }

}
