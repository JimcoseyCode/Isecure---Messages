.class public final Landroidx/fragment/app/i$e;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/i;->I(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/i;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Z

.field final synthetic d:Landroidx/fragment/app/Q$c;

.field final synthetic e:Landroidx/fragment/app/i$a;


# direct methods
.method constructor <init>(Landroidx/fragment/app/i;Landroid/view/View;ZLandroidx/fragment/app/Q$c;Landroidx/fragment/app/i$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/i$e;->a:Landroidx/fragment/app/i;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/i$e;->b:Landroid/view/View;

    .line 4
    .line 5
    iput-boolean p3, p0, Landroidx/fragment/app/i$e;->c:Z

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/fragment/app/i$e;->d:Landroidx/fragment/app/Q$c;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/fragment/app/i$e;->e:Landroidx/fragment/app/i$a;

    .line 10
    .line 11
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    const-string v0, "anim"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/fragment/app/i$e;->a:Landroidx/fragment/app/i;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Landroidx/fragment/app/i$e;->b:Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    iget-boolean p1, p0, Landroidx/fragment/app/i$e;->c:Z

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Landroidx/fragment/app/i$e;->d:Landroidx/fragment/app/Q$c;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/fragment/app/Q$c;->g()Landroidx/fragment/app/Q$c$b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, Landroidx/fragment/app/i$e;->b:Landroid/view/View;

    .line 28
    .line 29
    const-string v1, "viewToAnimate"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Q$c$b;->j(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/i$e;->e:Landroidx/fragment/app/i$a;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/fragment/app/i$b;->a()V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x2

    .line 43
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    iget-object p1, p0, Landroidx/fragment/app/i$e;->d:Landroidx/fragment/app/Q$c;

    .line 50
    .line 51
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method
