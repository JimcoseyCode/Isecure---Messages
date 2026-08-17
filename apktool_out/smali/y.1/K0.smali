.class public final Ly/K0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/K0$a;
    }
.end annotation


# instance fields
.field private final a:Ly/L0;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;


# direct methods
.method constructor <init>(Ly/L0;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly/K0;->a:Ly/L0;

    .line 5
    .line 6
    iput-object p2, p0, Ly/K0;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Ly/K0;->c:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/K0;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/K0;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ly/L0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/K0;->a:Ly/L0;

    .line 2
    .line 3
    return-object v0
.end method
