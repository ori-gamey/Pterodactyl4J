package com.mattmalec.pterodactyl4j.application.entities;

import com.mattmalec.pterodactyl4j.PteroAction;
import com.mattmalec.pterodactyl4j.application.managers.LocationManager;
import com.mattmalec.pterodactyl4j.application.managers.NodeManager;
import com.mattmalec.pterodactyl4j.application.managers.UserManager;

import java.util.List;

public interface PteroApplication {

	PteroAction<List<User>> retrieveUsers();
	PteroAction<User> retrieveUserById(String id);
	PteroAction<User> retrieveUserById(long id);
	PteroAction<List<User>> retrieveUsersByUsername(String name, boolean caseSensetive);
	PteroAction<List<User>> retrieveUsersByEmail(String name, boolean caseSensetive);
	UserManager getUserManager();

	PteroAction<List<Node>> retrieveNodes();
	PteroAction<Node> retrieveNodeById(String id);
	PteroAction<Node> retrieveNodeById(long id);
	PteroAction<List<Node>> retrieveNodesByName(String name, boolean caseSensetive);
	NodeManager getNodeManager();


	PteroAction<List<Location>> retrieveLocations();
	PteroAction<Location> retrieveLocationById(String id);
	PteroAction<Location> retrieveLocationById(long id);
	PteroAction<List<Location>> retrieveLocationsByShortCode(String name, boolean caseSensetive);
	LocationManager getLocationManager();

	PteroAction<List<Egg>> retrieveEggsByNest(Nest nest);
	PteroAction<Nest> retrieveNestById(String id);
	PteroAction<Nest> retrieveNestById(long id);
	PteroAction<List<Nest>> retrieveNests();
	PteroAction<List<Nest>> retrieveNestsByAuthor(String author, boolean caseSensetive);
	PteroAction<List<Nest>> retrieveNestsByName(String name, boolean caseSensetive);


}
