package assignment2;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.TreeSet;
import java.io.*;

import assignment2.exceptions.InvalidUserDetailException;
import assignment2.data.User;
import assignment2.exceptions.InvalidCourseException;
import assignment2.util.DiskManager;
import assignment2.view.initPromptBox;
public class assignement2 {	 
	 public static void main(String[] args) {
		 Set<User> _users = new TreeSet<User>();
		 initPromptBox.initPrompt(_users);
		 
	    }

}
