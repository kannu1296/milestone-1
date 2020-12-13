package modifier_v2;

import modifier.FacebookStatus;

/**
 * Protected access specifier example
 */
public class FriendOfFriend extends FacebookStatus {
    @Override
    protected void friendOfFriend() {
        super.friendOfFriend();
    }
}
