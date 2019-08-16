package com.abdulwaheed.scorecalculator.modals.utilities;

public class AppSession {

    private static AppSession appSession;

    private String eventName;
    private final String [] teamNames = new String[2];
    private GameCriteria mGameCriteria;

    public static AppSession getInstance() {
        if (appSession == null) {
            synchronized (AppSession.class) {
                if (appSession == null){
                    appSession = new AppSession();
                }
            }
        }
        return appSession;
    }

    private AppSession(){}

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String[] getTeamNames() {
        return teamNames;
    }

    public final class GameCriteria {
        private int oversInAMatch;
        private int oversAllowedToABowler;

        public int getOversInAMatch() {
            return oversInAMatch;
        }

        public void setOversInAMatch(int oversInAMatch) {
            this.oversInAMatch = oversInAMatch;
        }

        public int getOversAllowedToABowler() {
            return oversAllowedToABowler;
        }

        public void setOversAllowedToABowler(int oversAllowedToABowler) {
            this.oversAllowedToABowler = oversAllowedToABowler;
        }
    }

    public GameCriteria getGameCriteria() {
        return mGameCriteria;
    }

    public void setGameCriteria(GameCriteria mGameCriteria) {
        this.mGameCriteria = mGameCriteria;
    }
}
