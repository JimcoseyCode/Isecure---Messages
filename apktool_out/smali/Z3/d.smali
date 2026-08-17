.class public final LZ3/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ3/d$a;
    }
.end annotation


# static fields
.field private static final c:LZ3/d;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LZ3/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, LZ3/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LZ3/d$a;->a()LZ3/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, LZ3/d;->c:LZ3/d;

    .line 11
    .line 12
    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ3/d;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LZ3/d;->b:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public static c()LZ3/d$a;
    .locals 1

    .line 1
    new-instance v0, LZ3/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, LZ3/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LZ3/d;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LZ3/d;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
