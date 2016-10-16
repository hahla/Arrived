package us.arrived.arrived;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * Created by echessa on 7/17/15.
 */
public final class Settings {

    Config conf = ConfigFactory.load();

    private Config playConf = conf.getConfig("play");
    public String YOUTUBE_API_KEY = playConf.getString("api_key");

}
