.class public final Lcom/facebook/yoga/YogaValue;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/yoga/YogaValue$a;,
        Lcom/facebook/yoga/YogaValue$b;
    }
.end annotation


# static fields
.field public static final c:Lcom/facebook/yoga/YogaValue$a;

.field public static final d:Lcom/facebook/yoga/YogaValue;

.field public static final e:Lcom/facebook/yoga/YogaValue;

.field public static final f:Lcom/facebook/yoga/YogaValue;


# instance fields
.field public final a:F

.field public final b:Lcom/facebook/yoga/w;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/yoga/YogaValue$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/yoga/YogaValue$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/yoga/YogaValue;->c:Lcom/facebook/yoga/YogaValue$a;

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/yoga/YogaValue;

    .line 10
    .line 11
    sget v1, Lcom/facebook/yoga/g;->b:F

    .line 12
    .line 13
    sget-object v2, Lcom/facebook/yoga/w;->h:Lcom/facebook/yoga/w;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/facebook/yoga/YogaValue;-><init>(FLcom/facebook/yoga/w;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/facebook/yoga/YogaValue;->d:Lcom/facebook/yoga/YogaValue;

    .line 19
    .line 20
    new-instance v0, Lcom/facebook/yoga/YogaValue;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    sget-object v3, Lcom/facebook/yoga/w;->i:Lcom/facebook/yoga/w;

    .line 24
    .line 25
    invoke-direct {v0, v2, v3}, Lcom/facebook/yoga/YogaValue;-><init>(FLcom/facebook/yoga/w;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lcom/facebook/yoga/YogaValue;->e:Lcom/facebook/yoga/YogaValue;

    .line 29
    .line 30
    new-instance v0, Lcom/facebook/yoga/YogaValue;

    .line 31
    .line 32
    sget-object v2, Lcom/facebook/yoga/w;->k:Lcom/facebook/yoga/w;

    .line 33
    .line 34
    invoke-direct {v0, v1, v2}, Lcom/facebook/yoga/YogaValue;-><init>(FLcom/facebook/yoga/w;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lcom/facebook/yoga/YogaValue;->f:Lcom/facebook/yoga/YogaValue;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(FI)V
    .locals 1

    .line 2
    invoke-static {p2}, Lcom/facebook/yoga/w;->j(I)Lcom/facebook/yoga/w;

    move-result-object p2

    const-string v0, "fromInt(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/facebook/yoga/YogaValue;-><init>(FLcom/facebook/yoga/w;)V

    return-void
.end method

.method public constructor <init>(FLcom/facebook/yoga/w;)V
    .locals 1

    const-string v0, "unit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/facebook/yoga/YogaValue;->a:F

    iput-object p2, p0, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/w;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/facebook/yoga/YogaValue;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/w;

    .line 7
    .line 8
    check-cast p1, Lcom/facebook/yoga/YogaValue;

    .line 9
    .line 10
    iget-object v2, p1, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/w;

    .line 11
    .line 12
    if-ne v0, v2, :cond_2

    .line 13
    .line 14
    sget-object v2, Lcom/facebook/yoga/w;->h:Lcom/facebook/yoga/w;

    .line 15
    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    sget-object v2, Lcom/facebook/yoga/w;->k:Lcom/facebook/yoga/w;

    .line 19
    .line 20
    if-eq v0, v2, :cond_1

    .line 21
    .line 22
    iget v0, p0, Lcom/facebook/yoga/YogaValue;->a:F

    .line 23
    .line 24
    iget p1, p1, Lcom/facebook/yoga/YogaValue;->a:F

    .line 25
    .line 26
    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v1

    .line 34
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_2
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/yoga/YogaValue;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/w;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/facebook/yoga/w;->k()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/w;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/yoga/YogaValue$b;->a:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_3

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const-string v0, "auto"

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    iget v0, p0, Lcom/facebook/yoga/YogaValue;->a:F

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, "%"

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :cond_2
    iget v0, p0, Lcom/facebook/yoga/YogaValue;->a:F

    .line 53
    .line 54
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :cond_3
    const-string v0, "undefined"

    .line 60
    .line 61
    return-object v0
.end method
