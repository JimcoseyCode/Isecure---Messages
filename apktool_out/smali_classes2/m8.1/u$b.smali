.class abstract Lm8/u$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static final a:Ljava/util/Iterator;

.field private static final b:Ljava/lang/Iterable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm8/u$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lm8/u$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm8/u$b;->a:Ljava/util/Iterator;

    .line 7
    .line 8
    new-instance v0, Lm8/u$b$b;

    .line 9
    .line 10
    invoke-direct {v0}, Lm8/u$b$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lm8/u$b;->b:Ljava/lang/Iterable;

    .line 14
    .line 15
    return-void
.end method

.method static synthetic a()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, Lm8/u$b;->a:Ljava/util/Iterator;

    .line 2
    .line 3
    return-object v0
.end method

.method static b()Ljava/lang/Iterable;
    .locals 1

    .line 1
    sget-object v0, Lm8/u$b;->b:Ljava/lang/Iterable;

    .line 2
    .line 3
    return-object v0
.end method
