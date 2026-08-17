.class public final Lh9/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/c$b;,
        Lh9/c$a;
    }
.end annotation


# static fields
.field public static final c:Lh9/c$a;


# instance fields
.field private final a:Le9/B;

.field private final b:Le9/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh9/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lh9/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lh9/c;->c:Lh9/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Le9/B;Le9/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh9/c;->a:Le9/B;

    .line 5
    .line 6
    iput-object p2, p0, Lh9/c;->b:Le9/D;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Le9/D;
    .locals 1

    .line 1
    iget-object v0, p0, Lh9/c;->b:Le9/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Le9/B;
    .locals 1

    .line 1
    iget-object v0, p0, Lh9/c;->a:Le9/B;

    .line 2
    .line 3
    return-object v0
.end method
