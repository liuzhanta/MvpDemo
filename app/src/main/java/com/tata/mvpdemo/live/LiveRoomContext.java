package com.tata.mvpdemo.live;

public class LiveRoomContext {

    private boolean isPublish;
    public Object liveActivity;
    public Object presenter;
    public Object viewHolder;
    public Object callback;


    public boolean isPublish() {
        return isPublish;
    }

    public void setPublish(boolean publish) {
        isPublish = publish;
    }

    ILiveRoomShow liveRoomShow;

    public void showLiveRoom() {
        liveRoomShow = LiveRoomShowFactory.create(isPublish);
        liveRoomShow.show(this);
    }

    public ILiveRoomShow getLiveRoomShow() {
        return liveRoomShow;
    }

    public static class LiveRoomShowFactory {
        public static ILiveRoomShow create(boolean isAuthor) {
            if (isAuthor) {
                return new AuthorLiveRoomShow();
            } else {
                return new AudienceLiveRoomShow();
            }
        }
    }
}

