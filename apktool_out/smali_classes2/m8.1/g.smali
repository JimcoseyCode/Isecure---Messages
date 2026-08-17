.class public Lm8/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm8/g$a;
    }
.end annotation


# static fields
.field private static final b:Lm8/g;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm8/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lm8/g;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm8/g;->b:Lm8/g;

    .line 8
    .line 9
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lm8/g;->a:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Lm8/g;->a:Ljava/util/Map;

    return-void
.end method

.method public static c()Lm8/g;
    .locals 1

    .line 1
    sget-object v0, Lm8/g;->b:Lm8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static d()Lm8/g;
    .locals 1

    .line 1
    new-instance v0, Lm8/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lm8/g;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final a(Lm8/i$f;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lm8/g;->a:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v1, Lm8/g$a;

    .line 4
    .line 5
    invoke-virtual {p1}, Lm8/i$f;->b()Lm8/p;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {p1}, Lm8/i$f;->d()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-direct {v1, v2, v3}, Lm8/g$a;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public b(Lm8/p;I)Lm8/i$f;
    .locals 2

    .line 1
    iget-object v0, p0, Lm8/g;->a:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v1, Lm8/g$a;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Lm8/g$a;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lm8/i$f;

    .line 13
    .line 14
    return-object p1
.end method
