package new5;
/*
 *���ͣ�generic��������������ߵ��÷�����ʱ���ȥ��ȷ�����ݵ����͡����������͡�
	��ʽ��ͨ��<>������Ҫ�����������������͡�<>���������������͵ġ�
 �����ڽӿ���
3.3 ���������С�������Ҫ�����������������Ͳ�ȷ����ʱ��ע�⣺�������ݲ�ȷ���޷��Զ��壩��
	��������ھ����ԡ�
3.3.2 ���Ͷ����ڷ����ϣ��ɲ�����ͬ�������͡������Ա��ⷺ����ľ����ԡ�
3.3.3 ��̬���������Է������϶���ķ��͡���Ϊ�������ڶ�����ء�
�����̬����������Ӧ���������Ͳ�ȷ�������Խ����Ͷ����ڷ����ϡ�
 */
class Demo<T>{
	//��������ھ����ԡ�����������ͺ󣬷���������Ҳ���̶�
	public void show(T t){
		System.out.println("show:"+t);
	}
	//���Ͷ����ڷ����ϣ��ɲ�����ͬ�������͡������Ա��ⷺ����ľ����ԡ�
	public <W> void method(W w){
		System.out.println("method:"+w);
	}
	//��̬���������Է������϶���ķ��͡���Ϊ�������ڶ�����ء�ֻ�ܶ����ڷ�����
	public static <Q> void jing(Q q){
		System.out.println("jing:"+q);
	}
}
public class DefineGeneric {

	public static void main(String[] args) {
		Demo<Integer> d = new Demo<Integer>();
		d.show(12);
//		d.show("");//�޷�ʹ�ô���������������
		
		d.method(12);
		d.method("");
		d.method(true);
		
		d.jing(12);
		Demo.jing("faf");
	}

}