package rm.logutil;

/**
 * @author Roberto Morelos
 * @since 7/5/17
 * Enables/disables logs.
 */
public class LogU {
    private static boolean isEnabledLogs = false;

    public static void enableLogs(boolean isEnabledLogs){
        LogU.isEnabledLogs = isEnabledLogs;
    }

    public static void v(String tag, String message){
        if (isEnabledLogs){
            if (null != tag && null != message){
                android.util.Log.v(tag,message);
            }
        }
    }

    public static void v(String tag, String message, Throwable throwable){
        if (isEnabledLogs){
            if (null != tag && null != message && null != throwable){
                android.util.Log.v(tag,message,throwable);
            }
        }
    }

    public static void v(String tag, String message, boolean enableLogs){
        if (isEnabledLogs && enableLogs){
            if (null != tag && null != message){
                android.util.Log.v(tag,message);
            }
        }
    }

    public static void v(String tag, String message, Throwable throwable, boolean enableLogs){
        if (isEnabledLogs && enableLogs){
            if (null != tag && null != message && null != throwable){
                android.util.Log.v(tag,message,throwable);
            }
        }
    }

    public static void d(String tag, String message){
        if (isEnabledLogs){
            if (null != tag && null != message){
                android.util.Log.d(tag,message);
            }
        }
    }

    public static void d(String tag, String message, Throwable throwable){
        if (isEnabledLogs){
            if (null != tag && null != message && null != throwable){
                android.util.Log.d(tag,message,throwable);
            }
        }
    }

    public static void d(String tag, String message, boolean enableLogs){
        if (isEnabledLogs && enableLogs){
            if (null != tag && null != message){
                android.util.Log.d(tag,message);
            }
        }
    }

    public static void d(String tag, String message, Throwable throwable, boolean enableLogs){
        if (isEnabledLogs && enableLogs){
            if (null != tag && null != message && null != throwable){
                android.util.Log.d(tag,message,throwable);
            }
        }
    }

    public static void e(String tag, String message){
        if (isEnabledLogs){
            if (null != tag && null != message){
                android.util.Log.e(tag,message);
            }
        }
    }

    public static void e(String tag, String message, Throwable throwable){
        if (isEnabledLogs){
            if (null != tag && null != message && null != throwable){
                android.util.Log.e(tag,message,throwable);
            }
        }
    }

    public static void e(String tag, String message, boolean enableLogs){
        if (isEnabledLogs && enableLogs){
            if (null != tag && null != message){
                android.util.Log.e(tag,message);
            }
        }
    }

    public static void e(String tag, String message, Throwable throwable, boolean enableLogs){
        if (isEnabledLogs && enableLogs){
            if (null != tag && null != message && null != throwable){
                android.util.Log.e(tag,message,throwable);
            }
        }
    }

    public static void i(String tag, String message){
        if (isEnabledLogs){
            if (null != tag && null != message){
                android.util.Log.i(tag,message);
            }
        }
    }

    public static void i(String tag, String message, Throwable throwable){
        if (isEnabledLogs){
            if (null != tag && null != message && null != throwable){
                android.util.Log.i(tag,message,throwable);
            }
        }
    }

    public static void i(String tag, String message, boolean enableLogs){
        if (isEnabledLogs && enableLogs){
            if (null != tag && null != message){
                android.util.Log.i(tag,message);
            }
        }
    }

    public static void i(String tag, String message, Throwable throwable, boolean enableLogs){
        if (isEnabledLogs && enableLogs){
            if (null != tag && null != message && null != throwable){
                android.util.Log.i(tag,message,throwable);
            }
        }
    }
}
