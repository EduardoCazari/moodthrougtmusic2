# Code Changes on moodthrougtmusic

During a conversation with Weverton Medeiros (My Java Mentor) about the first Mood Througt Music Project, he showed me that the way I create the classes was not the rigth way to do that in Java. As all the project classes are composed by albums, there was no reason to have a Album class as a parent class and three other child classes for each specific album. They accutally should be instances (objects) of the album class.

So here are the changes.