package com.javasolution;

import java.util.ArrayList;

public class ContainsDuplicate {

    public int Solution(int nums[]) {
//        ArrayList<Integer> al = new ArrayList<>();
//       for(int i=0;i<nums.length;i++){
//           if(!al.contains(nums[i])){
//               al.add(nums[i]);
//           }else{
//               return true;
//           }
//       }
//       return false;
//    }

//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//        return sum;

//        int sum =0;
//        int arr[]=new int[nums.length];
//        for(int i =0;i<nums.length;i++){
//            for(int j=i;j<nums.length;j++){
//                for(int k=j;k<nums.length;k++){
//                    System.out.print(nums[k]+" ");
//                }
//                System.out.println(" ");
//            }
//
//        }
//        return sum;

        int max =0;
        int sum=0;
        for(var i:nums){
            sum += i;
            max = Math.max(sum,max);

            if(sum<0) sum=0;

        }
        return max;
    }


    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int nums[]={1,2,3,4,5};

        System.out.println(cd.Solution(nums));
    }
}

