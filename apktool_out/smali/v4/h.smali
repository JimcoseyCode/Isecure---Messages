.class public final synthetic Lv4/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lp4/i;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/moduleinstall/internal/c;

.field public final synthetic b:Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/common/moduleinstall/internal/c;Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv4/h;->a:Lcom/google/android/gms/common/moduleinstall/internal/c;

    .line 5
    .line 6
    iput-object p2, p0, Lv4/h;->b:Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/common/moduleinstall/internal/d;

    .line 2
    .line 3
    check-cast p2, LP4/m;

    .line 4
    .line 5
    new-instance v0, Lv4/j;

    .line 6
    .line 7
    iget-object v1, p0, Lv4/h;->a:Lcom/google/android/gms/common/moduleinstall/internal/c;

    .line 8
    .line 9
    invoke-direct {v0, v1, p2}, Lv4/j;-><init>(Lcom/google/android/gms/common/moduleinstall/internal/c;LP4/m;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/b;->C()Landroid/os/IInterface;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/google/android/gms/common/moduleinstall/internal/a;

    .line 17
    .line 18
    iget-object p2, p0, Lv4/h;->b:Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p1, v0, p2, v1}, Lcom/google/android/gms/common/moduleinstall/internal/a;->y(Lv4/e;Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;Lv4/f;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
