.class public final synthetic Lj6/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP4/k;


# instance fields
.field public final synthetic a:Lj6/e;


# direct methods
.method public synthetic constructor <init>(Lj6/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj6/d;->a:Lj6/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LP4/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lj6/d;->a:Lj6/e;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lj6/e;->a(Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;)LP4/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
