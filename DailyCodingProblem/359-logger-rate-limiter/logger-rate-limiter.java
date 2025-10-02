class Logger {
    
    Map<String, Integer> logMap = new HashMap<String, Integer>();

    public Logger() {
        
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        // Check if the message was logged before and if the cooldown period has not passed.
        // The map stores the next allowed timestamp for a message.
        if (logMap.containsKey(message)) {
            if (timestamp < logMap.get(message)) {
                // Current time is before the allowed time, so don't print.
                return false;
            }
        }
        
        // If the message is new or the cooldown period has passed,
        // it's okay to print. Update the next allowed timestamp and return true.
        logMap.put(message, timestamp + 10);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */