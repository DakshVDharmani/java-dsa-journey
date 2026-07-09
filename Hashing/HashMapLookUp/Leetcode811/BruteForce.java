//Brute Force solution 

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        HashMap<String, Integer> mp = new HashMap<>(); 

        for(int i = 0; i<cpdomains.length; i++){
            String[] parts = cpdomains[i].split(" "); 
            //splitting requires time, takes brute force position. 

            int num = Integer.parseInt(parts[0]); 

            String[] subdomain = parts[1].split("\\."); 

            String curr = ""; 

            for(int j = subdomain.length-1; j>=0; j--){

                if(curr.equals(""))
                    curr = subdomain[j]; 
                else
                    curr = subdomain[j] + "." + curr; 

                mp.put(curr, mp.getOrDefault(curr, 0)+num); 
                //HashMap lookup operation's average case utilizes O(1) time. 
            }
        }

        /*
        HashMap get operation can utilize O(N) time. 
        But that rarely happens in Java 8. It uses balanced trees for heavily colliding buckets. 
        This hash collisions still keep the average case. 
        */

        List<String> ans = new ArrayList<>(); 

        for(String key: mp.keySet()){
            ans.add(mp.get(key) + " " + key); 
        }

        return ans; 
    }
}

//Time complexity = O(N x L) <-N = number of domains, L = length of each domain. 
//Space complexity = O(k) <-where k are the total number of subdomains. 
