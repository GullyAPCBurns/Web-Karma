package edu.isi.karma.util;

import java.util.prefs.Preferences;

public class RemoveKarmaHomeFromPreferences {

	public static void main(String[] args) {
		Preferences preferences = Preferences.userRoot().node("WebKarma");
		preferences.remove("KARMA_USER_HOME");
	}

}
