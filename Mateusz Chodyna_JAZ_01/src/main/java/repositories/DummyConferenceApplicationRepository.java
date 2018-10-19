package repositories;

import java.util.*;

import domain.ConferenceApplication;

public class DummyConferenceApplicationRepository implements
ConferenceApplicationRepository{
		private static List<ConferenceApplication> db = new ArrayList<ConferenceApplication>();
	@Override
	public ConferenceApplication getApplicationByEmailAddress(String email) {
		for(ConferenceApplication application: db) {
			if(application.getEmail().equalsIgnoreCase(email))
				return application;
		}
		return null;
	}

	@Override
	public void add(ConferenceApplication application) {
		db.add(application);
		
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return db.size();
	}

}
