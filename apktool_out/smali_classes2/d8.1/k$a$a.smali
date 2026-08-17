.class public final Ld8/k$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld8/k$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ld8/k;

.field private final b:Ld8/n;


# direct methods
.method public constructor <init>(Ld8/k;Ld8/n;)V
    .locals 1

    .line 1
    const-string v0, "deserializationComponentsForJava"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "deserializedDescriptorResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ld8/k$a$a;->a:Ld8/k;

    .line 15
    .line 16
    iput-object p2, p0, Ld8/k$a$a;->b:Ld8/n;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ld8/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ld8/k$a$a;->a:Ld8/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ld8/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ld8/k$a$a;->b:Ld8/n;

    .line 2
    .line 3
    return-object v0
.end method
