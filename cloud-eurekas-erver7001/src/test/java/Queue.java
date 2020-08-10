import java.util.Scanner;

public class Queue {

    public static void main(String[] arg0) {
        System.out.println(2%3);
        MyQueue queue = new MyQueue(3);
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        char key =' ';
        while (loop){
            System.out.println("s(show)：显示队列");
            System.out.println("e(exit)：退出程序");
            System.out.println("a(add)：添加数据到队列");
            System.out.println("g(get)：从队列取数据");
            System.out.println("h(head)：查看队列头数据");
            key=scanner.next().charAt(0);
            switch (key){
                case 's':
                    queue.showAll();
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                case 'a':
                    System.out.println("请输入一个整数");
                    int inValue = scanner.nextInt();
                    queue.addQueueElement(inValue);
                    break;
                case 'g':
                    try {
                        int getValue = queue.getQueueElement();
                        System.out.println("从队列中取出数据：" + getValue);
                        break;
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                case 'h':
                    try {
                        int value = queue.getHead();
                        System.out.println("当前队列数据头部为："+value);
                        break;
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                default:{
                    break;
                }
            }

        }
    }
}

    class MyQueue{
        private int maxCount; //数组的最大容量
        private int start; //队列头
        private int end; //队列尾
        private int[] queueArray; //存队列数据

        //创建队列构造器
        public MyQueue(int max){
            maxCount=max+1;
            start=0;
            end=0;
            queueArray=new int[max];
        }

        //判断队列是否满

        public boolean isFull(){
            return start == (end+1)%maxCount;
        }

        //判断队列是否空
        public boolean isEmpty(){
            return start==end;
        }

        //向队列尾部添加值
        public void addQueueElement(int elementValue){
            if(isFull()){
                System.out.println("队列已满，无法添加数据");
                return;
            }
            queueArray[end] = elementValue;
            end = (end+1)%maxCount;
        }

        /**
         * 从队列尾部获取数据
         * @return
         */
        public int getQueueElement(){
            if(isEmpty()){
                throw new RuntimeException("队列无数据");
            }
            int value = queueArray[start];
            start = (start+1)%maxCount;
            return value;
        }

        //显示头部数据
        public int getHead(){
            if(isEmpty()){
                throw new RuntimeException("队列无数据");
            }
            return queueArray[start];
        }

        //显示所有数据
        public void showAll(){
            if(isEmpty()){
                System.out.println("队列无数据");
                return;
            }
            System.out.println("开始显示队列数据");
            for(int a=start;a<start+isEnableCount();a++){
                System.out.println(queueArray[a%maxCount]);
            }
            System.out.println("结束显示队列数据");
        }

        //队列的有效个数
        public int isEnableCount(){
            return (end+maxCount-start)%maxCount;
        }



    }
