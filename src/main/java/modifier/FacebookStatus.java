package modifier;

/**
 * facebook status upload options
 */
public class FacebookStatus {
    /**
     * Only i can See, status private
     */
    private void onlyMe(){}

    /**
     * Me and my friends can See, status default
     */
    void friend(){}

    /**
     * Myself, friends, and friends of friends can see,. status Protected
     */
    protected void friendOfFriend(){}

    /**
     * Anyone on facebook can see. status public
     */
    public void anyOne(){}
}
