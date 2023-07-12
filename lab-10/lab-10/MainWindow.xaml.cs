using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace lab_10
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void CH1(object sender, RoutedEventArgs e)
        {
            bt1.IsEnabled = false;
        }
        private void CH3(object sender, RoutedEventArgs e)
        {
            bt1.IsEnabled = true;
        }

        private void CH2(object sender, RoutedEventArgs e)
        {
            if (pn1 != null)
                pn1.Visibility = Visibility.Visible;
        }
        private void CH4(object sender, RoutedEventArgs e)
        {
            if (pn1 != null)
                pn1.Visibility = Visibility.Collapsed;
        }

        private void RB1(object sender, RoutedEventArgs e)
        {
            if (pn1 != null)
            pn1.Background = Brushes.White;
        }
        private void RB2(object sender, RoutedEventArgs e)
        {
            if (pn1 != null)
            pn1.Background = Brushes.Red;
        }
        private void RB3(object sender, RoutedEventArgs e)
        {
            if (pn1 != null)
                pn1.Background = Brushes.Yellow;
        }

    }
}
