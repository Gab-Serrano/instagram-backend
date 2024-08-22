package com.fullstack.instagram.repository;

import java.util.ArrayList;
import java.util.List;

import com.fullstack.instagram.model.ProfileInfo;
import com.fullstack.instagram.model.User;

public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User findUserById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public void updateUser(String id, User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                users.set(i, updatedUser);
                return;
            }
        }
    }

    public void deleteUser(String id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                users.remove(i);
                return;
            }
        }
    }

    public UserRepository() {
        // Inicializar la lista con 5 usuarios
        users.add(new User("1", "pepe.frog", "AAssdd123!", "pepe@frog.com", "Pepe the Frog", "1990-01-01",
                new ProfileInfo("Internet Meme Legend",
                        "🌿 Pepe the Frog 🐸 📸 Meme legend 🌐 Spreading smiles one meme at a time 💚 Living the frog life 🎨 Artwork & laughs #PepeTheFrog #MemeLife #FrogLife #ArtAndLaughs",
                        "/img/feed/profile_feed.png", "1,234", "5,678", "9,101")));

        users.add(new User("2", "grumpy.cat", "Meow1234!", "grumpy@cat.com", "Grumpy Cat", "2012-04-04",
                new ProfileInfo("The Grumpiest Cat",
                        "😾 Grumpy Cat 😾 A meme legend living the grumpy life, one frown at a time. #GrumpyCat #MemeLife",
                        "/img/feed/grumpy_feed.png", "2,345", "8,123", "7,890")));

        users.add(new User("3", "doge", "WowSuchSecure!", "doge@wow.com", "Doge", "2010-05-06",
                new ProfileInfo("Much Meme, Such Wow",
                        "🐶 Doge 🐶 The most wow dog of the internet. Such meme, much wow. #Doge #MemeLife #Wow",
                        "/img/feed/doge_feed.png", "5,678", "12,345", "11,987")));

        users.add(new User("4", "nyan.cat", "Rainbow123!", "nyan@cat.com", "Nyan Cat", "2011-04-01",
                new ProfileInfo("The Flying Pop-Tart Cat",
                        "🌈 Nyan Cat 🌈 Flying through space on a rainbow tail. Soaring through memes. #NyanCat #MemeLife #Rainbow",
                        "/img/feed/nyan_cat.png", "7,890", "20,456", "18,765")));

    }

}
