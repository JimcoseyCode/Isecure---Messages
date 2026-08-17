.class final synthetic Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$41;
.super Lkotlin/jvm/internal/v;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/next/records/SkipFormatter;-><init>(Ljava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$41;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$41;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$41;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$41;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$41;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 4

    .line 1
    const-string v0, "getDates()Ljava/util/List;"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-class v2, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;

    .line 5
    .line 6
    const-string v3, "dates"

    .line 7
    .line 8
    invoke-direct {p0, v2, v3, v0, v1}, Lkotlin/jvm/internal/v;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;

    .line 2
    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->getDates()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
