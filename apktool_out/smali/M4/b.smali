.class final LM4/b;
.super Lo4/a$a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lo4/a$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lr4/c;Ljava/lang/Object;Lo4/f$a;Lo4/f$b;)Lo4/a$f;
    .locals 8

    .line 1
    check-cast p4, LM4/a;

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/signin/internal/a;

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-static {p3}, Lcom/google/android/gms/signin/internal/a;->j0(Lr4/c;)Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object v5

    .line 10
    move-object v1, p1

    .line 11
    move-object v2, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v6, p5

    .line 14
    move-object v7, p6

    .line 15
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/signin/internal/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLr4/c;Landroid/os/Bundle;Lo4/f$a;Lo4/f$b;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
