class Logger {
    
    Map<String, Integer> logMap = new HashMap<String, Integer>();

    public Logger() {
        
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        if(logMap.containsKey(message)){
            logMap.put(message, logMap.getOrDefault(message+10));
            if(timestamp < logMap.get(message)){
                return true;
            } else {
                return false;
            }
            
        } else {
            logMap.put(message, timestamp);
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