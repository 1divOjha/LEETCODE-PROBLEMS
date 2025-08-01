class Solution {
    public int sumOfUnique(int[] nums) {


int result = Arrays.stream(nums)
    .boxed()
    .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
    .entrySet().stream()
    .filter(e -> e.getValue() == 1)
    .mapToInt(Map.Entry::getKey)
    .sum();
    return result;

        //correct runs
// int sum=0;
// HashMap<Integer, Integer> map = new HashMap<>();
// //frequency map, stores, num as index and its count as value;
// //map.getValue(),  map.getKey(); map.getOrDefault();
// for(int num: nums){
//     map.put(num, map.getOrDefault(num,0) +1);
//    //stored all num, and their occurances 
// }

// for( Map.Entry<Integer, Integer> entry: map.entrySet()){ //we just mention map here, bs inside loop, entry will do the work
//     if(entry.getValue()==1){
//         sum+= entry.getKey();
//     }
// }
// return sum;


        // this is fine, but doesnt handle duplicates well, only removes duplicate on 2nd occurance, and adds them on 1st and 3 rd occurance
        //using hashmap to store this count as occurance may help;
        // int sum=0;
        // HashSet<Integer> set= new   HashSet<>();
        // for(int num: nums){
        //     if(set.contains(num) && !set.isEmpty()){
        //         set.remove(num);
        //     }
        //     else{
        //         set.add(num);
        //     }
            
        // }
        // Iterator<Integer> itr= set.iterator();
        // while(itr.hasNext()){
        //     sum+=itr.next();
        // }

        // return sum;
    }
}